package lists.doublylinkedlist;

import java.util.Objects;

public class EmployeeNode {
    private Employee employee;
    private EmployeeNode next;
    private EmployeeNode previous;

    public EmployeeNode(Employee employee) {
        this.employee = employee;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public EmployeeNode getNext() {
        return next;
    }

    public void setNext(EmployeeNode next) {
        this.next = next;
    }

    public EmployeeNode getPrevious() {
        return previous;
    }

    public void setPrevious(EmployeeNode previous) {
        this.previous = previous;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof EmployeeNode)) return false;
        EmployeeNode that = (EmployeeNode) o;
        return getEmployee().equals(that.getEmployee()) &&
                getNext().equals(that.getNext()) &&
                getPrevious().equals(that.getPrevious());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getEmployee(), getNext(), getPrevious());
    }

    public String toString() {
        return employee.toString();
    }
}


