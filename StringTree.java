//*******************************************************************************
//Assignment 8          Author: Carlos Fernandez/L30031020
//
//Alphabetic Organizer Program
//*******************************************************************************

class StringTree {

	private Node root;

	static int i = 1;

	public StringTree() {

		root = null;

	}

	public void addValue(String s) {

		Node n = new Node(s);

		if (root == null)

			root = n;

		else {

			Node current = root;

			while (current != null) {

				if (s.compareTo(current.value) < 0)

				{

					if (current.left == null)

					{

						current.left = n;

						return;

					}

					else

						current = current.left;

				}

				else

				{

					if (current.right == null)

					{

						current.right = n;

						return;

					}

					else

						current = current.right;

				}

			}

		}

	}

	private void inOrder(Node n) {

		if (n == null)
			return;

		inOrder(n.left);

		System.out.println((i++) + " " + n.value);

		inOrder(n.right);

	}

	public void print() {

		inOrder(root);

	}

}