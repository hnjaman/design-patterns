package src.iterator;

public interface IIterator {

    //Reset to first element
    void First();

    //get next element
    String Next();

    //End of collection check
    Boolean IsDone();

    //Retrieve Current Item
    String CurrentItem();
}
