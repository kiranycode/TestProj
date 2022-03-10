package com.begining.DS.chapter2;

public class SimpleBinaryTree<K,V> implements BinaryTree<K, V> {

	
	protected BinaryTreeNode<K,V> rootNode;  
	
	@Override
	public V get(K key) {
		return get(key, rootNode);

	}
	
	
	
	

	private V get(K key, BinaryTreeNode<K, V> node) {
		if(node!=null){
			if(((Comparable<K>)key).compareTo(node.getKey()) ==0){
				return node.getValue();	
			}else if(((Comparable<K>)key).compareTo(node.getKey()) <0){
				return  get(key,node.left); 
			}else{
				return get(key,node.right);
			}
		}
		return null;
	}


	
	private BinaryTreeNode<K, V> getNode(K key, BinaryTreeNode<K, V> node) {
		if(node!=null){
			if(((Comparable<K>)key).compareTo(node.getKey()) ==0){
				return node;	
			}else if(((Comparable<K>)key).compareTo(node.getKey()) <0){
				return  getNode(key,node.left); 
			}else{
				return getNode(key,node.right);
			}
		}
		return null;
	}
	
	
	public void delete(K key){
		BinaryTreeNode<K, V> node =getNode(key,rootNode );
		if(node!=null){
			if(node.left==null && node.right==null){
				node =null;
			}else if(node.right==null){
				node=node.left;
			}else if(node.left==null){
				node=node.right;
			}else{
				BinaryTreeNode<K, V> minNode = getMinNode(node.right);
				node =minNode;
				minNode=null;
			}
		}else{
			System.out.println("node not found");
		}
	}


	@Override
	public void put(K key, V value) {
		if(rootNode==null){
			rootNode =new  BinaryTreeNode<K,V>(key,value);
		}else{
			put(key,value,rootNode);
		}
		
	}
	
	private void put(K key, V value, BinaryTreeNode<K, V> node) {
		if(((Comparable<K>)key).compareTo(node.getKey()) <0){
			if(node.left==null){
				node.left = new  BinaryTreeNode<K,V>(key,value);
			}else{
				put(key,value,node.left);
			}

		}else if(((Comparable<K>)key).compareTo(node.getKey()) >0){
			if(node.right==null){
				node.right = new  BinaryTreeNode<K,V>(key,value);
			}else{
				put(key,value,node.right);
			}
		}else{
			node.setValue(value);
		}
		
	}

	private K minKey() {
		if(rootNode==null)
			return null;
		
		return	getMinKey(rootNode);
				
	}
	
	private K getMinKey(BinaryTreeNode<K, V> node){
		if(node.left!=null){
			return getMinKey(node.left);
		}else{
			return node.getKey();
		}
	}
	
	
	private BinaryTreeNode<K, V> getMinNode(BinaryTreeNode<K, V> node){
		if(node.left!=null){
			return getMinNode(node.left);
		}else{
			return node;
		}
	}
	
	
	private K maxKey() {
		if(rootNode==null)
			return null;
		
		return	getMaxKey(rootNode);
				
	}
	
	private K getMaxKey(BinaryTreeNode<K, V> node){
		if(node.right!=null){
			return getMinKey(node.right);
		}else{
			return node.getKey();
		}
	}
	
	
	public static void main(String[] args) {
		SimpleBinaryTree<Integer, String> binaryTree = new SimpleBinaryTree<Integer, String>();
        System.out.println(binaryTree.minKey());
        binaryTree.put(457998224, "Isabel");
        binaryTree.put(366112467, "John");
        binaryTree.put(671031776, "Ruth");
        binaryTree.put(225198452, "Sarah");
        binaryTree.put(419274013, "Peter");
        binaryTree.put(751965387, "Tom");

        System.out.println(binaryTree.get(457998224));
        System.out.println(binaryTree.get(366112467));
        System.out.println(binaryTree.get(671031776));
        System.out.println(binaryTree.get(225198452));
        System.out.println(binaryTree.get(419274013));
        System.out.println(binaryTree.get(751965387));

        binaryTree.put(751965387, "Sam");

        System.out.println(binaryTree.get(751965387));
        System.out.println(binaryTree.get(999999999));
        System.out.println(binaryTree.minKey());
        System.out.println(binaryTree.maxKey());
        
        
        
        binaryTree.delete(366112467);
        
        binaryTree.printDfs();
        binaryTree.printBfs();

	}
	
	private void printBfs() {
		// TODO Auto-generated method stub
		
	}

	private void printDfs() {
		// TODO Auto-generated method stub
		
	}

	

	

}
