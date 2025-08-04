package enumeration.test;

public enum AuthGrade {
    GUEST(1,"손님"),
    LOGIN(2,"로그인 회원"),
    ADMIN(3,"관리자");

    private final int level;
    private final String description;

    AuthGrade(int level, String description) {
        this.level = level;
        this.description = description;
    }

    //조회할 수 있게 함
    public int getLevel() {
        return level;
    }
    public String getDescription() {
        return description;
    }

}
