package Bai1;

public class GenealogyManagement {
    public void findSingle(Person person){
        if(person.getMarried()==null){
            System.out.println(person.getName());
        }
        else {
            for(Person children: person.getChild()){
                findSingle(children);
            }
        }
    }
    public void find2Children(Person person){
        if(person.getMarried()!=null) {
            if(person.getNumOfChildren()==2){
                System.out.println(person.getName() + " and " + person.getMarried().getName());
            }
            for(Person children: person.getChild()){
                find2Children(children);
            }
        }
    }
    public void findNewGeneration(Person person){
        if(person.getNumOfChildren()==0){
            System.out.println(person.getName());
        }
        else {
            for (Person children: person.getChild()){
                findNewGeneration(children);
            }
        }
    }
}
