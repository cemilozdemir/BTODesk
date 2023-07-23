import java.util.ArrayList;

public class Rehber {

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int isFree() {
        return freeStatus;
    }

    public void setFree(int free) {
        this.freeStatus = free;
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
    public int freeStatus;
    public String originalDepartment;
    public ArrayList<String> otherDeps = new ArrayList<String>();


    Rehber(String name, String originalDepartment){
        this.name = name;
        this.freeStatus = 1;
        this.originalDepartment = originalDepartment;

    }

}
