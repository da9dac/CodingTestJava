package ProgrammersLevelZero;

public class LoginSuccess {
    public static void main(String[] args) {
        String[] id_pw = {"programmer01", "15789"};
        String[][] db = {{"programmer02", "111111"}, {"programmer00", "134"}, {"programmer01", "1145"}};

        for(int i = 0; i < db.length; i++) {
            if(id_pw[0].equals(db[i][0])) {
                if(id_pw[1].equals(db[i][1])) {
                    System.out.println("login");
                } else {
                    System.out.println("wrongpw");
                }

            } else {
                System.out.println("fail");
            }
        }
    }
}
