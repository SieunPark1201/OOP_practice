package Contests.Week14;

public class Con14_01 {
    public static void main(String[] args) {
        LinkedList3<Book> list = new LinkedList3<Book>( );

        // Test for addToEnd method
        Book book1 = new Book("A Tale of Two Cities", 1859);
        list.addToEnd(book1);
        Book book2 = new Book("The Little Prince", 1943);
        list.addToEnd(book2);
        Book book3 = new Book("Harry Potter and the Philosopher's Stone", 1997);
        list.addToEnd(book3);
        Book book4 = new Book("And Then There Were None", 1939);
        list.addToEnd(book4);
        System.out.println("------------------------------");
        System.out.println("List size: " + list.size( ));
        list.outputList( );

        // Test for deleteNode method
        Book book5 = new Book("Harry Potter and the Philosopher's Stone", 1997);
        boolean isDeleted = list.deleteNode(book5);
        System.out.println("\n------------------------------");
        System.out.println("Deleted Harry Potter? " + isDeleted);
        Book book6 = new Book("The Davinci Code", 2003);
        isDeleted = list.deleteNode(book6);
        System.out.println("Deleted Davinci Code? " + isDeleted);
        System.out.println("List size: " + list.size( ));
        list.outputList( );

    }
}

class LinkedList3<T>
{
    private class Node<T>
    {
        private T data;
        private Node<T> link;

        public Node( )
        {
            data = null;
            link = null;
        }

        public Node(T newData, Node<T> linkValue)
        {
            data = newData;
            link = linkValue;
        }
    }//End of Node<T> inner class

    private Node<T> head;

    public LinkedList3( )
    {
        head = null;
    }

    public void addToStart(T itemData)
    {
        head = new Node<T>(itemData, head);
    }

    public boolean deleteHeadNode( )
    {
        if (head != null)
        {
            head = head.link;
            return true;
        }
        else
            return false;
    }

    public int size( )
    {
        int count = 0;
        Node<T> position = head;
        while (position != null)
        {
            count++;
            position = position.link;
        }
        return count;
    }

    public boolean contains(T item)
    {
        return (find(item) != null);
    }

    private Node<T> find(T target)
    {
        Node<T> position = head;
        T itemAtPosition;
        while (position != null)
        {
            itemAtPosition = position.data;
            if (itemAtPosition.equals(target))
                return position;
            position = position.link;
        }
        return null; //target was not found
    }

    public T findData(T target)
    {
        return find(target).data;
    }

    public void outputList( )
    {
        Node<T> position = head;
        while (position != null)
        {
            System.out.println(position.data);
            position = position.link;
        }
    }

    public boolean isEmpty( )
    {
        return (head == null);
    }

    public void clear( )
    {
        head = null;
    }

    public boolean equals(Object otherObject)
    {
        if (otherObject == null)
            return false;
        else if (getClass( ) != otherObject.getClass( ))
            return false;
        else
        {
            LinkedList3<T> otherList = (LinkedList3<T>)otherObject;
            if (size( ) != otherList.size( ))
                return false;
            Node<T> position = head;
            Node<T> otherPosition = otherList.head;
            while (position != null)
            {
                if (!(position.data.equals(otherPosition.data)))
                    return false;
                position = position.link;
                otherPosition = otherPosition.link;
            }
            return true; //no mismatch was not found
        }
    }

    public void addToEnd(T item){
        Node<T> position = head;

        if (position == null) {
            head = new Node<T>(item, null);
            return;
        }

        while (position.link != null) {
            position = position.link;
        }

        Node<T> newNode = new Node<T>(item, null);
        position.link = newNode;
    }

    public boolean deleteNode(T item) {
        Node<T> position = head;
        while (position.link != null) {
            if (position.link.data.toString().equals(item.toString())) {
                Node<T>newLink = position.link.link;
                position.link = newLink;
                return true;
            } else {
                position = position.link;
            }
        }
        return false;
    }
}

class Book
{
    private String title;
    private int year;

    public Book(String title, int year){
        this.title = title;
        this.year = year;
    }

    public String toString(){
        return this.title+" "+this.year;
    }
}


