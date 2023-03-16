package ru.geekbrains.lesson3;

public class Program {


    public static void main(String[] args) {
  
        ListLink listLink = new ListLink(); 

        listLink.addBack(1);
        listLink.addBack(3);
        listLink.addBack(6);
        listLink.addBack(8);

        System.out.println("\nДо разворота");
        listLink.printList();

        listLink.reverseList();

        System.out.println("\n\nПосле");
        listLink.printList();
        System.out.println("\n");
    }

    public static class ListElement {
        ListElement next;    
        int data;            
    }
     
    public static class ListLink {
        private ListElement head;     
        private ListElement tail;      
     
        public void addFront(int data)           
        {
            ListElement a = new ListElement(); 
            a.data = data;              
            if (head == null)          
            {                         
                head = a;           
                tail = a;
            } else {
                a.next = head;      
                head = a;              
            }
        }
     
        public void addBack(int data) {          
            ListElement a = new ListElement(); 
            a.data = data;
            if (tail == null)       
            {                           
                head = a;            
                tail = a;
            } else {
                tail.next = a;       
                tail = a;               
            }
        }
     
        public void printList()         
        {
            ListElement t = head;    
            while (t != null)          
            {
                System.out.print(t.data + " "); 
                t = t.next;                            
            }
        }

        public void reverseList() {
            ListElement reversedPart = null;
            ListElement current = head;
            while (current != null) {
                ListElement next = current.next;
                current.next = reversedPart;
                reversedPart = current;
                current = next;
            }
            head = reversedPart;
        }


    }

}
