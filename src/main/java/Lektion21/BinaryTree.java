package Lektion21;

public class BinaryTree<T extends Comparable<T>> {
        Knoten<T> root=null;
        public void print(){
            try{
                root.print();
            }catch (NullPointerException e){System.err.println("Der Baum hat keinme Elemente");}
        }
        public void insert(T element){
            try{root.insert(element);}catch (NullPointerException e){
                root=new Knoten<>(element);
            }
        }
        private static class Knoten<T extends Comparable<T>>{
            T element;
             Knoten<T> left, right;
            public Knoten(T element){
                this.element=element;
            }
            public void insert(T element){
                if(this.element.compareTo(element)==0){System.err.println("Die Datei existiert schon");}

            if(this.element.compareTo(element)<0){
            if(right!=null)right.insert(element);
            else right=new Knoten<>(element);}
            else {
                if(left!=null)left.insert(element);
                else left=new Knoten<>(element);}
            }

            public void print(){
                try{left.print();}catch (NullPointerException e){}
                System.out.println(element);
                try{right.print();}catch (NullPointerException e){}
            }
            }
         public static void main(String[] args){
            BinaryTree<String> tree = new BinaryTree<>();
            tree.insert("kay");
             tree.insert("kays");
             tree.insert("kevin");
             tree.print();

         }
}
