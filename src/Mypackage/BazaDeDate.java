/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mypackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BazaDeDate implements AutoCloseable {

    private Connection connection;

    private static final String DatabaseCreation
            = "PRAGMA foreign_keys=ON;\n" + "CREATE TABLE IF NOT EXISTS 'clienti' ("
            + " 'cod_card' INTEGER NOT NULL,"
            + "'nume' TEXT NOT NULL, "
            + "'prenume' TEXT NOT NULL, "
            + "'bani' DOUBLE NOT NULL, "
            + "PRIMARY KEY('cod_card') "
            + ");\n"
            + "CREATE TABLE IF NOT EXISTS 'autobuze' ("
            + "'numar_autobuz' INTEGER NOT NULL, "
            + "'statii' TEXT NOT NULL, "
            + "PRIMARY KEY('numar_autobuz')"
            + ");\n"
            + "INSERT into autobuze ( statii) VALUES ('Dristor, Piata Muncii, Piata Iancului, Obor, Stefan cel Mare, Piata Victoriei, Gara de nord, Basarab, Crangasi, Petrache Poenaru, Grozavesti, Eroilo, Izvor, Piata Unirii'); \n"
            + "INSERT into autobuze ( statii) VALUES ( 'Berceni, Dimitrie Leonida, Aparatorii Patriei, Piata Sudului, Constantin Brancoveanu, Eroii revolutiei, Tineretului, Piata Unirii, Universitate, Piata Romana, Piata Victoriei, Aviatorilor, Aurel Vlaicu, Pipera '); \n"
            + "INSERT into autobuze (statii) VALUES ( 'Anghel Saligny, Nicolae Teclu, Nicolae Grigorescu, Dristor, Mihai Bravu, Timpuri noi, Piata Unirii, Izvor, Eroilor, Politehnica, Lujerului, Gorjului, Pacii, Preciziei'); \n"
            + "INSERT into autobuze (statii) VALUES ( 'Gara de nord, Basarab, Grivita, 1 Mai, Jiului, Parc Bazilescu, Laminiorului, Straulesti, Depou Straulesti, Mogosoaia '); \n"
            + "INSERT into autobuze ( statii) VALUES ( ' Pantelimon, Piata Iancului, Universitate, Hasdeu, Eroilor, Academia Militara, Orizont, Favorit, Tudor Vladimirescu, Parc Drumul Taberei, Romancierilor, Valea Ialomitei, Valea Argesului, Drumul Taberei'); \n"
            + "INSERT into autobuze (statii) VALUES ('1 Mai, Pajura, Piata Montreal, Gara Baneasa, Aeroport Baneasa, Tokyo, Washington, Paris, Bruxelles, Ion I.C. Bratianu, Aeroport Henri Coanda- Otopeni'); \n"
            + "INSERT into autobuze ( statii) VALUES ( 'Aeroport Henri Coanda- Otopeni, Mogosoaia, Preciziei, Valea Ialomitei, Berceni, Anghel Saligny, Pantelimon, Pipera, Aeroport Henri Coanda- Otopeni '); \n"
            + "INSERT into autobuze ( statii) VALUES ( 'Gara de nord, Hasdeu, Izvor, Eroii Revolutiei, Bacovia, Piata Progresul, Toporan, Gradistea, Luica, Alexandru Moldoveanu, Gara Progresul '); \n"
            + "INSERT into autobuze ( statii) VALUES ( 'Universitate, Piata Iancului, Stadionul National, Delfinului, Morarilor, Granitului, Pantelimon'); \n"
            + "INSERT into autobuze ( statii) VALUES ('Depoul Voluntari, Bucegi, Vlahuta, Voluntari, Colentina, Depoul RATB, Sportului, Andronache, Doamna Ghica, Obor'); \n"
            + "CREATE TABLE IF NOT EXISTS 'validari' ("
            + "'id_validare' INTEGER NOT NULL, "
            + "'cod_card' INTEGER NOT NULL, "
            + "'numar_autobuz' INTEGER NOT NULL, "
            + "'zi' INTEGER NOT NULL, "
            + "'luna' INTEGER NOT NULL, "
            + "'an' INTEGER NOT NULL, "
            + "'ora' INTEGER NOT NULL, "
            + "'minut' INTEGER NOT NULL, "
            + "'numar_persoane' INTEGER NOT NULL, "
            + "PRIMARY KEY('id_validare') "
            + ");\n"
            + "CREATE TABLE IF NOT EXISTS 'abonamente' ("
            + " 'id_abonament' INTEGER NOT NULL,"
            + "'cod_card' INTEGER NOT NULL , "
            + "'tip_abonament' TEXT NOT NULL, "
            + "'zi_start' INTEGER NOT NULL, "
            + "'luna_start' INTEGER NOT NULL, "
            + "'an_start' INTEGER NOT NULL, "
            + "'zi_end' INTEGER , "
            + "'luna_end' INTEGER , "
            + "'an_end' INTEGER , "
            + "'numar_autobuz' INTEGER , "
            + "PRIMARY KEY('id_abonament') "
            + ");";

    public BazaDeDate() throws SQLException {
        connection = null;
        connect();
    }

    @Override
    public void close() throws Exception {
        if (connection != null) {
            connection.close();
            connection = null;
        }
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void connect() throws SQLException {

        String s = "ratb.db";
        String ss = "jdbc:sqlite";
        String sss = ss + ":" + s;

        connection = DriverManager.getConnection(sss);
        try (Statement statement = connection.createStatement()) {
            statement.executeUpdate(DatabaseCreation);
        }

    }

    boolean verificaCard(int codCard) throws SQLException {

        PreparedStatement statement = connection.prepareStatement("SELECT max(cod_card) cod_card from clienti; ");

        ResultSet rs = statement.executeQuery();
        rs.next();
        int cod = rs.getInt("cod_card");

        if (codCard > 0 && cod >= codCard) {
            return true;
        } else {
            return false;
        }

    }

    void incarcareCard(int codClientCurent, double s) throws SQLException {

        PreparedStatement statement = connection.prepareStatement("UPDATE clienti SET bani = bani+ ? WHERE cod_Card = ?; ");
        statement.setDouble(1, s);
        statement.setInt(2, codClientCurent);

        statement.executeUpdate();

    }

    public String verificare(int codCard, int nrAutobuz, int nrPersoane) throws SQLException {
        StringBuilder sb = new StringBuilder();
        sb.append("");
        sb.append(codCard);
        String codCardString = sb.toString();

        PreparedStatement statement = connection.prepareStatement("select numar_persoane,numar_autobuz,zi,luna,an,ora,minut from validari where (cod_card = ".concat(codCardString).concat(");"));
        ResultSet rs = statement.executeQuery();

        if (rs.next()) {
            if (rs.getInt(1) == nrPersoane && rs.getInt(2) == nrAutobuz) {
                int zi = rs.getInt(3);
                StringBuilder sbZi = new StringBuilder();
                sbZi.append("");
                sbZi.append(zi);
                String ziString = sbZi.toString();

                int luna = rs.getInt(4);
                StringBuilder sbluna = new StringBuilder();
                sbluna.append("");
                sbluna.append(luna);
                String lunaString = sbluna.toString();

                int an = rs.getInt(5);
                StringBuilder sban = new StringBuilder();
                sban.append("");
                sban.append(an);
                String anString = sban.toString();

                int ora = rs.getInt(6);
                StringBuilder sbora = new StringBuilder();
                sbora.append("");
                sbora.append(ora);
                String oraString = sbora.toString();

                int minut = rs.getInt(7);
                StringBuilder sbm = new StringBuilder();
                sbm.append("");
                sbm.append(minut);
                String mString = sbm.toString();

                String message = "cardul a fost validat in data de: ".concat(ziString).concat("/").concat(lunaString).concat("/").concat(anString).concat(" ").concat("la ora: ").concat(oraString).concat(":").concat(mString);
                statement.close();
                return message;
            }
        }

        statement.close();
        return "cardul nu a fost validat";
    }

    public String scadeBani(int codCard, int nrPersoane) throws SQLException {
        PreparedStatement statement = connection.prepareStatement("select bani from clienti where cod_card = ?;");
        statement.setInt(1, codCard);
        ResultSet rs = statement.executeQuery();
        rs.next();
        double bani = rs.getDouble(1);
        double suma = nrPersoane * 1.3;
        if (bani >= suma) {
            //daca are bani::::
            statement = connection.prepareStatement("update clienti set bani = ? where cod_card = ?;");
            statement.setDouble(1, bani - suma);
            statement.setInt(2, codCard);
            statement.executeUpdate();
            statement.close();
            rs.close();
            return "tranzactie acceptata";
        } else {
            //daca nu are bani::::  
            statement.close();
            rs.close();
            return "fonduri insuficiente";
        }

    }

    public String addValidare(int codCard, int nrAutobuz, int zi, int luna, int an, int ora, int minut, int nrPersoane) throws SQLException {
        System.out.println(codCard + " " + nrAutobuz + " " + zi + " " + luna + " " + an + " " + ora + " " + minut + " " + nrPersoane);

        PreparedStatement statement = connection.prepareStatement("select cod_card from validari where (cod_card = ?);");
        statement.setInt(1, codCard);
        ResultSet rs = statement.executeQuery();

        if (rs.next()) {
            statement.close();
            statement = connection.prepareStatement("delete  from validari where (cod_card = ?);");
            statement.setInt(1, codCard);
            statement.executeUpdate();
            statement.close();

        } else {
            statement.close();
        }

        // aici verific daca exista abonamentul
        statement = connection.prepareStatement("select zi_start, luna_start, an_start,zi_end, luna_end, an_end from abonamente where (cod_card = ? and (numar_autobuz = ? or numar_autobuz = 0));");
        statement.setInt(1, codCard);
        statement.setInt(2, nrAutobuz);
        ResultSet resultSet = statement.executeQuery();

        while (resultSet.next()) {

            int ziStart = resultSet.getInt(1);
            int lunaStart = resultSet.getInt(2);
            int anStart = resultSet.getInt(3);
            int ziEnd = resultSet.getInt(4);
            int lunaEnd = resultSet.getInt(5);
            int anEnd = resultSet.getInt(6);
            System.out.println("am gasit abonamentul : " + ziStart + " " + lunaStart + " " + anStart);
            if (ziStart <= zi && lunaStart <= luna && anStart <= an && ziEnd >= zi && anEnd >= an && lunaEnd >= luna) {
                if (nrPersoane > 0) {
                    String s = scadeBani(codCard, nrPersoane);
                    if (s.equals("tranzactie acceptata")) {
                        statement.close();
                        String makeInsert = "INSERT INTO validari (cod_card,numar_autobuz,zi,luna,an,ora, minut,numar_persoane) VALUES (?,?,?,?,?,?,?,?);";
                        if (connection == null || connection.isClosed()) {
                            System.out.println("Conexiune pierduta");
                        }

                        statement = connection.prepareStatement(makeInsert);

                        statement.setInt(1, codCard);
                        statement.setInt(2, nrAutobuz);
                        statement.setInt(3, zi);
                        statement.setInt(4, luna);
                        statement.setInt(5, an);
                        statement.setInt(6, ora);
                        statement.setInt(7, minut);
                        statement.setInt(8, nrPersoane);
                        statement.executeUpdate();
                        statement.close();
                        return "card validat";
                    } else {
                        //fonduri insuficiente pentru numarul de persoane selectat
                        statement.close();
                        return "fonduri insuficiente pentru numarul de persoane selectat";
                    }
                } else {
                    //valideaza doar pt el::
                    statement.close();
                    String makeInsert = "INSERT INTO validari (cod_card,numar_autobuz,zi,luna,an,ora, minut,numar_persoane) VALUES (?,?,?,?,?,?,?,?);";
                    if (connection == null || connection.isClosed()) {
                        System.out.println("Conexiune pierduta");
                    }

                    statement = connection.prepareStatement(makeInsert);

                    statement.setInt(1, codCard);
                    statement.setInt(2, nrAutobuz);
                    statement.setInt(3, zi);
                    statement.setInt(4, luna);
                    statement.setInt(5, an);
                    statement.setInt(6, ora);
                    statement.setInt(7, minut);
                    statement.setInt(8, nrPersoane);
                    statement.executeUpdate();
                    statement.close();
                    return "card validat";
                }

            }

        }
        //valideaza pt un nr de pers si pt el 
        int suma = nrPersoane + 1;
        String s = scadeBani(codCard, suma);
        if (s.equals("tranzactie acceptata")) {
            statement.close();
            String makeInsert = "INSERT INTO validari (cod_card,numar_autobuz,zi,luna,an,ora, minut,numar_persoane) VALUES (?,?,?,?,?,?,?,?);";
            if (connection == null || connection.isClosed()) {
                System.out.println("Conexiune pierduta");
            }

            statement = connection.prepareStatement(makeInsert);

            statement.setInt(1, codCard);
            statement.setInt(2, nrAutobuz);
            statement.setInt(3, zi);
            statement.setInt(4, luna);
            statement.setInt(5, an);
            statement.setInt(6, ora);
            statement.setInt(7, minut);
            statement.setInt(8, suma);
            statement.executeUpdate();
            statement.close();
            return "card validat";
        } else {
            //abonament inexistent si fonduri insuficiente
            statement.close();
            return "abonament inexistent si fonduri insuficiente";
        }

    }

    public void add(String nume, String prenume) throws SQLException {
        Card c = new Card(nume, prenume);
        String makeInsert = "INSERT INTO clienti ( nume,prenume, bani) VALUES (?,?,?);";
        if (connection == null || connection.isClosed()) {
            System.out.println("Conexiune pierduta");
        }

        PreparedStatement statement = connection.prepareStatement(makeInsert);

        statement.setDouble(3, c.getBani());
        statement.setString(1, nume);
        statement.setString(2, prenume);
        statement.executeUpdate();
        statement.close();

        statement = connection.prepareStatement("SELECT max(cod_card) cod_card from clienti;");
        ResultSet rs = statement.executeQuery();
        rs.next();
        int cod = rs.getInt(1);
        c.setCodCard(cod);
        statement.close();

//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    boolean anBisect(int year) {
        if (year % 400 == 0) {
            return true;
        }
        if (year % 100 == 0) {
            return false;
        }
        return (year % 4 == 0);
    }

    boolean existaAbonament(int codClient, String tipAbonament, int zi, int luna, int an, int linie) {

        String q = " SELECT tip_abonament from abonamente where ( cod_card= ? and tip_abonament=? and (numar_autobuz=0 or numar_autobuz=?) and (zi_end>? and luna_end>=? or an_end>?)); ";
        PreparedStatement statement;
        try {
            statement = connection.prepareStatement(q);
            statement.setInt(1, codClient);
            statement.setString(2, tipAbonament);
            statement.setInt(3, linie);
            statement.setInt(4, zi);
            statement.setInt(5, luna);
            statement.setInt(6, an);
            ResultSet rs = statement.executeQuery();
            System.out.println("am executat query");

            int ok = 0;

            if (rs.next() == false) {
                ok = 1;
            }
            System.out.println(ok);

            if (ok == 1) {
                return false;
            } else {
                return true;
            }

        } catch (SQLException ex) {
            Logger.getLogger(BazaDeDate.class.getName()).log(Level.SEVERE, null, ex);
        }

        return true;

    }

    void creareAbonament(int codClient, String tipAbonament, int zi, int luna, int an, int linie) throws SQLException {
        System.out.println(tipAbonament + " " + zi + " " + luna + " " + an + " " + linie);
        int[] days = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int zileInAvans;
        if (tipAbonament.equals("zi")) {
            zileInAvans = 1;
        } else {
            zileInAvans = 30;
        }
        int day = zi, month = luna, year = an;
        for (int i = 0; i < zileInAvans; i++) {
            day++;
            if (day > days[month - 1] || (month == 2 && day == 29 && !anBisect(year))) {
                day = 1;
                month++;
                if (month == 13) {
                    month = 1;
                    year++;
                }
            }
        }
        System.out.println("se termina pe : " + day + " " + month + " " + year);
        String q = "INSERT INTO abonamente ( cod_card,tip_abonament,zi_start, luna_start,an_start,numar_autobuz, zi_end, luna_end, an_end) VALUES (?,?,?,?,?,?,?,?,?);";

        PreparedStatement statement = connection.prepareStatement(q);
        statement.setInt(1, codClient);
        statement.setInt(3, zi);
        statement.setInt(4, luna);
        statement.setInt(5, an);
        statement.setInt(6, linie);
        statement.setString(2, tipAbonament);
        statement.setInt(7, day);
        statement.setInt(8, month);
        statement.setInt(9, year);
        statement.executeUpdate();
        statement.close();

    }

}
