public class SwitchStatement {

    public static void checkRole() {
        String role = provideRole();

        switch (role) {
            case "admin":
                System.out.println("You are an administrator");
                break;
            case "moderator":
                System.out.println("You are a moderator");
                break;
            case "user":
                System.out.println("You are a user");
            default:
                System.out.println("You are an guest");
        }
    }

    private static String provideRole() {
        String[] roles = {"admin", "moderator", "user", "guest"};
        int random = (int)(Math.random() * 3);

        return roles[random];
    }
}
