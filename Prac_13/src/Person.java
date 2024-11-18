public class Person {
    private final String firstName;
    private final String lastName;
    private final String middleName;


    public Person(String firstName, String lastName, String middleName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
    }

    public String getFullName(){
        StringBuilder fullName = new StringBuilder();

        if(lastName != null && !lastName.isEmpty()){
            fullName.append(lastName);
        }
        if(firstName != null && !firstName.isEmpty()){
            if(!fullName.isEmpty()){
                fullName.append(" ");
            }
            fullName.append(firstName.charAt(0)).append(".");
        }
        if (middleName != null && !middleName.isEmpty()) {
            if (!fullName.isEmpty()) {
                fullName.append(" ");
            }
            fullName.append(middleName.charAt(0)).append(".");
        }

        return fullName.toString();
    }
}