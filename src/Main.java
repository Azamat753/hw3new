public class Main {

    public static void main(String[] args) {
        String[] names = new String[3];
        System.out.println();
        names[0] = "Jack";
        names[1] = "Bill";
        names[2] = "John";


        for (int i = 0; i < 3; i++) {
            switch (i) {
                case 0:
                    System.out.println("Доброе утро" + " " + names[0]);
                    break;
                case 1:
                    System.out.println("Доброго дня " + " " + names[1]);
                    break;
                case 2:
                    System.out.println("Добрый вечер " + " " + names[2]);
                    break;
                default:
                    System.out.println("Здраствуйте");
            }
        }

        for (String name : names) {

            switch (name) {
                case "Jack":
                    System.out.println("Доброе утро" + " " + names[0]);
                    break;
                case "Bill":
                    System.out.println("Доброго дня " + " " + names[1]);
                    break;
                case "John":
                    System.out.println("Добрый вечер " + " " + names[2]);
                    break;
                default:
                    System.out.println("Здраствуйте");
            }
        }
    }


    }
























