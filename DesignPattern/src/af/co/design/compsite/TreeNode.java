package af.co.design.compsite;

import java.util.Enumeration;
import java.util.Vector;

/**
 * 组合模式
 * 
 * @author ZhangPeng-PC
 * 
 */
public class TreeNode {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	private TreeNode parent;

	public TreeNode getParent() {
		return parent;
	}

	public void setParent(TreeNode parent) {
		this.parent = parent;
	}

	private Vector<TreeNode> children = new Vector<>();

	public TreeNode(String name) {
		this.name = name;
	}

	// 添加孩子节点
	public void add(TreeNode node) {
		children.add(node);
	}

	// 删除孩子节点
	public void remote(TreeNode node) {
		children.remove(node);
	}

	public Enumeration<TreeNode> getChildren() {
		return children.elements();
	}

}
