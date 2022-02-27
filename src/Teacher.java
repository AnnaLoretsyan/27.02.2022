public class Teacher implements Comparable<Teacher> {
    private String name;
    private Integer age;
    private Integer experience;

    public Teacher(String name, Integer age, Integer experience) {
        this.name = name;
        this.age = age;
        this.experience = experience;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getExperience() {
        return experience;
    }

    public void setExperience(Integer experience) {
        this.experience = experience;
    }
    @Override
    public int compareTo(Teacher other ){
        if(experience>other.experience){
            return 1;
        }
        else if(other.experience>experience){
            return  -1;
        }
return 0;
    }

    @Override
    public java.lang.String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", experience=" + experience +

                '}';
    }
}
