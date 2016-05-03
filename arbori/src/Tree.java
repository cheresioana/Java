/**
 * Created by asus on 05/03/2016.
 */
public class Tree {
    private Tree left;
    private Tree right;
    private int val;



    public  Tree()
    {
        this.left = null;
        this.right = null;
        setVal(0);
    }

    public  Tree(int val)
    {
        this.left = null;
        this.right = null;
        setVal(val);

    }
    public int getRight() {
        if (right != null)
            return right.getVal();
        return 0;
    }


    public int getLeft() {
        if (left != null)
            return left.getVal();
        return 0;
    }

    public int getVal() {
        return val;
    }

    private void setVal(int val) {
        this.val = val;
    }
    public  void add(int nr)
    {
        Tree rad = this;
        boolean ok = true;
        while (ok)
        {
            if (rad.val >= nr)
            {
                if (rad.left != null)
                rad = rad.left;
                else {
                    rad.left = new Tree(nr);
                    ok = false;
                }
            }
            else if (rad.val < nr)
            {
                if (rad.right != null)
                rad = rad.right;
                else
                {
                    rad.right = new Tree(nr);
                    ok = false;
                }
            }
        }
    }
    public void traverse(Tree tree)
    {
        if (tree != null)
        {

            System.out.println(tree.val);
            traverse(tree.left);
            traverse(tree.right);
        }
    }
    private Tree getMin(Tree i)
    {
        i = i.right;
        while (i.left != null)
            i = i.left;
        return (i);
    }

    private Tree delRoot(Tree tree)
    {
        Tree min = getMin(tree);

        Tree i = tree.right;
        if (i.left != null)
        while (i.left.left != null)
            i = i.left;
        i.left = null;
        tree.setVal(min.getVal());
        return (tree);
    }

    private Tree delNode(Tree tree, int val, Tree t)
    {
        Tree next;
        byte k = 0;
        if (tree.getVal() == val)
            next = tree;
        else if (tree.getLeft() == val)
        {
            k = 1;
            next = tree.left;
        }
        else
        {
            k = 2;

            next = tree.right;
        }

        if (next.left == null && next.right == null)
        {
            if (k == 2)
                tree.right = null;
            else if (k == 1)
                tree.left = null;
            else tree = null;
            return (t);
        }
        else if (next.right != null && next.left == null)
        {
            if (k == 0)
                tree = tree.right;
            else if (k == 1)
                tree.left = next.right;
            else tree.right = next.right;
        }
        else if (next.right == null && next.left != null)
        {
            if (k == 0)
                tree = tree.left;
            else if (k == 1)
                tree.left = next.left;
            else tree.right = next.left;
        }
        else {
            Tree prev = getMin(tree);
            int   min = prev.left.getVal();
            prev.left = null;
            next.setVal(min);
        }
        return tree;
    }

    public Tree delete(int val)
    {
        Tree r = this;
        while (r != null && r.val != val)
        if (val < r.val)
        {
            if (r.left != null && r.left.getVal() == val)
                return (delNode(r, val, this));
             else if (r.left == null)
                return (null);
            else r = r.left;
        }
        else {
            if (r.right != null && r.right.getVal() == val)
                return (delNode(r, val, this));
            else if (r.right == null)
                return (null);
            else r = r.right;
        }
        return(delRoot(r));
    }
}
