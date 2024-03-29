import java.time.LocalDate;

public class ResidenceCertificate extends Document
{
    private Person person;
    private Status status;
    private String currentResidence;
    private String personFather;
    private String personMother;

    public static ResidenceCertificate GenerateResidenceCertificate(Person person, Status status, String currentResidence, String personFather, String personMother ) {
        var residenceCertificate = new ResidenceCertificate();
        residenceCertificate.setPerson(person);
        residenceCertificate.setIssuedDate(LocalDate.now());
        residenceCertificate.setIssueInstitution("MPB");
        residenceCertificate.setMunicipality(City.PRISHTINA);
        residenceCertificate.setCurrentResidence(currentResidence);
        residenceCertificate.setStatus(status);
        residenceCertificate.setIssuedPlace("ARC Prishtine");
        residenceCertificate.setPersonMother(personMother);
        residenceCertificate.setPersonFather(personFather);

        return residenceCertificate;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public String getCurrentResidence() {
        return currentResidence;
    }

    public void setCurrentResidence(String currentResidence) {
        this.currentResidence = currentResidence;
    }

    public String getPersonFather() {
        return personFather;
    }

    public void setPersonFather(String personFather) {
        this.personFather = personFather;
    }

    public String getPersonMother() {
        return personMother;
    }

    public void setPersonMother(String personMother) {
        this.personMother = personMother;
    }

    @Override
    public String toString() {
        return String.format("Nr i çertifikatës së vendbanimit %s\nEmri: %s%nMbiemri: %s%nNumri Personal: %d%nVendlindja: %s%nGjinia: %s%nNacionaliteti: %s%nData e lindjes: %s%n" +
                        "Data e lëshimit: %s%nVendi i lëshimit: %s%nEmri i Institucionit: %s%nKomuna: %s%nEmri i babait: %s%nEmri i nënës: %s%nGjendja martesore: %s%nVendbanimi aktual: %s%n-------------------------------%n",
                this.getDocumentId(),
                this.person.getName(),
                this.person.getSurname(),
                this.person.getPersonalNo(),
                this.person.getBirthPlace(),
                this.person.getGender(),
                this.person.getNationality(),
                this.person.getBirthDate().toString(),
                getIssuedDate(),getIssuedPlace(),getIssueInstitution(),getMunicipality(),
                (this.getPersonFather() != null) ? getPersonFather() : "Nuk ka babë",
                (this.getPersonMother() != null) ? getPersonMother() : "Nuk ka nënë",
                this.getStatus(),
                this.getCurrentResidence());
    }
}