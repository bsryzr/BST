
public class Uygulama {

	public static void main(String[] args) {
		// test edicez
		BTree bt = new BTree();    // BTree sınıfından nesne olusturduk ????
		bt.root=bt.Insert(bt.root,10);     // Insert fonksıyonu geri donus değeri olan bir fonksiyon o yuzden bu değeri biz rootta tutucaz
		bt.root=bt.Insert(bt.root,15); 
		bt.root=bt.Insert(bt.root,8); 
		bt.root=bt.Insert(bt.root,20); 
		bt.root=bt.Insert(bt.root,4); 
		bt.root=bt.Insert(bt.root,12); 
		
		System.out.println("kökün datasi:"+ bt.root.data);
		System.out.println("kökün sağ datasi:"+ bt.root.right.data);
		System.out.println("kökün sol datasi:"+ bt.root.left.data);
		System.out.println("kökün solunun solunun datasi:"+ bt.root.left.left.data);
		System.out.println("kökün solunun sağ datasi:"+ bt.root.left.right.data);
		

	}

}
