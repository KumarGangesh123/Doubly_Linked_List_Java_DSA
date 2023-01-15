/* 
  this is the "Node.java" file in which all the operations like:
    LinkedListCreation
    LinkedListInsertion
    LinkedListDeletion
  like methods are written
*/


class Node{
    int data;
    Node left;
    Node right;

    public Node(){ }

    public Node(int data){
        this.data=data;
        this.left=null;
        this.right=null;
    }

    public Node createNode(int data){
        return new Node(data);
    }

    public Node insertAtStart(Node head,int data){
        if(head==null){
            return new Node(data);
        }else{
            Node newNode=new Node(data);
            newNode.right=head;
            head.left=newNode;
            return newNode;
        }
    }

    public Node insertAtPos(Node head,int pos,int data){
        Node head2=head;
        Node newNode=new Node(data);
        int x=1;
        while(x!=pos-1){
            head2=head2.right;
            x++;
        }

        newNode.right=head2.right;
        head2.right.left=newNode;
        head2.right=newNode;
        newNode.left=head2;
        return head;
    }

    public Node insertAtLast(Node head,int data){
        if(head==null){
            return new Node(data);
        }else{
            Node newNode=new Node(data);
            Node head2=head;
            while(head2.right!=null){
                head2=head2.right;
            }

            head2.right=newNode;
            newNode.left=head2;
            return head;
        }
    }

    public Node deleteAtStart(Node head){
        Node delNode=head.right;
        delNode.left=null;
        return delNode;
    }

    public Node deleteAtPos(Node head,int pos){
        Node head2=head;
        int x=1;
        while(x!=pos-1){
            head2=head2.right;
            x++;
        }

        Node delNode=head2.right;

        head2.right=delNode.right;
        delNode.right.left=head2;
        return head;
    }

    public Node deleteAtLast(Node head){
        Node head2=head;
        while(head2.right.right!=null){
            head2=head2.right;
        }

        head2.right=null;
        return head;
    }

    public Node lastNode(Node head){
        while(head.right != null){
            head=head.right;
        }
        return head;
    }

    public int lengthOfList(Node head){
        int length=0;
        while(head.right!=null){
            length++;
            head=head.right;
        }return length;
    }

    public Node getDataNode(Node head,int value){
        while(head.right!=null){
            if(head.data==value){
                return head;
            }
        }return null;
    }

    public Node getIndexNode(Node head,int index){
        int i=0;
        while(i!=index){
            head=head.right;
            i++;
        }return head;
    }

    public void showListForward(Node head){
        System.out.print("\nData in the list in forward direction is :\n");
        while(head!=null){
            System.out.print(head.data+" ");
            head=head.right;
        }
    }

    public void showListBackward(Node head){
        System.out.print("\nData in the list in backward direction is :\n");
        while(head!=null){
            System.out.print(head.data+" ");
            head=head.left;
        }
    }


}
    
