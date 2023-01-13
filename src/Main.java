public class Main {
    public static void main(String[] args) {
        Person mom = (new PersonBuilder())
                .setName("Анна")
                .setSurname("Вольф")
                .setAge(31)
                //              .setAddress("Сидней")
                .build();
        System.out.println(mom);
        mom.happyBirthday();
        System.out.println(mom);
        Person son = mom.newChildBuilder().setName("Антошка").build();
        String var10001 = String.valueOf(mom);
        System.out.println("У " + var10001 + " есть сын, " + String.valueOf(son));
        System.out.println(mom.hasAge());

        Person sister;
        try {
            sister = (new PersonBuilder()).setName("Сергей").setSurname("Вольф").setAddress("Москва").build();
            (new PersonBuilder()).build();
            System.out.println(sister);
        } catch (IllegalStateException var5) {
            var5.printStackTrace();
        }

        try {
            sister = (new PersonBuilder()).setName("Мария").setSurname("Вольф").setAddress("Москва").setAge(-100).build();
            System.out.println(sister);
        } catch (IllegalArgumentException var4) {
            var4.printStackTrace();
        }

    }
}