public class inserttest{


bst obj=new bst();
public  test(){

obj.insert(0);
obj.insert(10);

obj.insert(11);

obj.insert(13);

obj.insert(2);
assertTrue(obj.search(0));
assertTrue(obj.search(10));
assertTrue(obj.search(11));
assertTrue(obj.search(13));




}


}