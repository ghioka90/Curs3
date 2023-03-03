package springapp;

public class JavaTeacher implements ITeacher {
    private WisdomWordsService wisdomService;

    // constructor unic care primeste ca parametru un obiect de tipul WisdomWordsService
    public JavaTeacher(WisdomWordsService wisdomService) {
        this.wisdomService = wisdomService;
    }

    @Override
    public String getHomework() {
        return "Create 100 classes";
    }


    @Override
    public String getWisdom() {
        return wisdomService.getMessage();
    }
}