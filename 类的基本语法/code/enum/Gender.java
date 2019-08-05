public enum Gender {
    MALE, FEMALE;
    private String name;

    public static void main(String[] args) {
        Gender male = Enum.valueOf(Gender.class, "MALE");
        System.out.println(male == Gender.MALE);
    }
}