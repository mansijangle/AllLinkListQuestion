/**
1472. Design Browser History
You have a browser of one tab where you start on the homepage and you can visit another url, get back in the history number of steps or move forward in the history number of steps.

Implement the BrowserHistory class:

BrowserHistory(string homepage) Initializes the object with the homepage of the browser.
void visit(string url) Visits url from the current page. It clears up all the forward history.
string back(int steps) Move steps back in history. If you can only return x steps in the history and steps > x, you will return only x steps. Return the current url after moving back in history at most steps.
string forward(int steps) Move steps forward in history. If you can only forward x steps in the history and steps > x, you will forward only x steps. Return the current url after forwarding in history at most steps.

*/


class Node{
    String data;
    Node next;
    Node prev;
    Node(){
        data = "";
        next = null;
        prev = null;
    }
    Node(String x){
        data = x;
        next = null;
        prev = null;
    }
    Node(String x,Node front ,Node back){
        data  = x;
        next = front;
        prev = back;
    }

}
class BrowserHistory {

    Node  currentPage;
    public BrowserHistory(String homepage) {
        currentPage = new Node(homepage);
    }
    
    public void visit(String url) {
        Node newnode = new Node(url);
        currentPage.next = newnode;
        newnode.prev = currentPage;
        currentPage = newnode;
    }
    
    public String back(int steps) {
        while(steps>0){
            if(currentPage.prev!=null){
                currentPage = currentPage.prev;
            }else{
                break;
            }
            steps--;
        }

        return currentPage.data;
    }
    
    public String forward(int steps) {
        while(steps>0){
            if(currentPage.next!=null){
                currentPage = currentPage.next;
            }else{
                break;
            }
            steps--;
        }
         return currentPage.data;
    }
}
