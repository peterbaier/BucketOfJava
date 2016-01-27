package D8;

import java.util.ArrayList;
import java.util.List;

public class BinaryTree {
    private Number numberTree = null;


    public Number getNumberTree() {
        return numberTree;
    }

    public void insert( Number current) {
        if(current == null) numberTree = current;
        else {
            if(numberTree.getNumber() >= current.getNumber()){
                insert(current.getBefore());
            }else {
                insert(current.getAfter());
            }
        }
    }

    public Integer[] flatTree(){
        return flatSortedTree(numberTree,new ArrayList<Number>());
    }

    private Integer[] flatSortedTree(Number current, List<Number> temp){
        while(current != null){
            temp.add(current);
            flatSortedTree(current.getBefore(),temp);
            flatSortedTree(current.getAfter(),temp);
        }
        Integer[] result = (Integer[]) temp.toArray();
        return result;
    }
}
