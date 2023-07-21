import java.util.ArrayList;

public class Rehber {

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isFree() {
        return isFree;
    }

    public void setFree(boolean free) {
        isFree = free;
    }

    public void addDep(String value){
        this.otherDeps.add(value);
    }

    public String getOriginalDepartment(){
        return originalDepartment;
    }

    public void print(){
        System.out.println(otherDeps.toString());
    }

    public String name;
    public boolean isFree;
    public String originalDepartment;
    public ArrayList<String> otherDeps = new ArrayList<String>();


    Rehber(String name, String originalDepartment){
        this.name = name;
        this.isFree = true;
        this.originalDepartment = originalDepartment;

    }

}
