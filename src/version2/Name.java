package version2;

public class Name {
    private String firstName;
    private String middleName;
    private String lastName;
    private String suffix;

    public Name() {
        this.firstName = "N/A";
        this.middleName = "";
        this.lastName = "N/A";
        this.suffix = "";
    }

    public Name(String firstName, String lastName) {
        this.firstName = firstName;
        this.middleName = "";
        this.lastName = lastName;
        this.suffix = "";
    }

    public Name(String firstName, String middleName, String lastName) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.suffix = "";
    }

    public Name(String firstName, String lastName, String middleName, String suffix) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.suffix = suffix;
    }

    public String getFirstName() {
        return firstName;

    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;

    }

    public String getMiddleName() {
        return middleName;

    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;

    }

    public String getLastName() {
        return lastName;

    }

    public void setLastName(String lastName) {
        this.lastName = lastName;

    }

    public String getSuffix() {
        return suffix;

    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;

    }

    private String getFormattedMI() {
        if (middleName != null && !middleName.trim().isEmpty() && !middleName.equals("N/A")) {
            return middleName.charAt(0) + ".";
        }
        return "";
    }

    public void displayName() {
        System.out.printf("%s, %s %s.", lastName, firstName, middleName);

    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(lastName).append(", ").append(firstName);

        String mi = getFormattedMI();
        if (!mi.isEmpty()) {
            sb.append(" ").append(mi);
        }

        if (suffix != null && !suffix.trim().isEmpty()) {
            sb.append(" ").append(suffix);
        }

        return sb.toString();
    }
}

