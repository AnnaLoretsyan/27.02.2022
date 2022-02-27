import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<Teacher>  treeSet = new TreeSet<Teacher>();
        Teacher teacher=new Teacher("Anna",30,10);
        Teacher teacher1=new Teacher("Ani",60,4);
        Teacher teacher2=new Teacher("Anahit",45,5);
        Teacher teacher3=new Teacher("Serob",20,2);
        treeSet.add(teacher);
        treeSet.add(teacher1);
        treeSet.add(teacher2);
        treeSet.add(teacher3);
        System.out.println(treeSet);
        removeOld(treeSet);
        System.out.println(removeOld(treeSet));
        System.out.println(removeYangTeachers(treeSet));





    }
    public static  TreeSet<Teacher> removeOld(TreeSet<Teacher>teachers){
        Iterator<Teacher> iterator =teachers.iterator();
        while (iterator.hasNext()){
            Teacher next= iterator.next();
            if (next.getAge()>45){
                iterator.remove();
            }
        }
        return teachers;




    }
    public static HashSet<Teacher> removeYangTeachers(TreeSet<Teacher> teachers){
    HashSet<Teacher> hashSet =   new   HashSet<Teacher>();
    Iterator<Teacher> iterator1= teachers.iterator();
    while (iterator1.hasNext()){
        Teacher next1= iterator1.next();
        if(next1.getExperience()<5){
            hashSet.add(next1);
        }


    }


        return hashSet;
    }
}
