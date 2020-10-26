package adt.linkedList;

public class RecursiveDoubleLinkedListImpl<T> extends RecursiveSingleLinkedListImpl<T> implements DoubleLinkedList<T> {

	protected RecursiveDoubleLinkedListImpl<T> previous;

	public RecursiveDoubleLinkedListImpl() {
	}
	
	@Override
	public void insert(T element) {
		if (super.isEmpty()) {
			super.setData(element);
			super.setNext(new RecursiveDoubleLinkedListImpl<>());
			((RecursiveDoubleLinkedListImpl<T>) super.getNext()).setPrevious(this);
			if (this.previous == null)  {
				this.previous = new RecursiveDoubleLinkedListImpl<>();
			}
		} else {
			((RecursiveDoubleLinkedListImpl<T>) super.getNext()).insert(element);
		}
	}
	
	@Override
	public void insertFirst(T element) {
		if (super.isEmpty()) {
			super.setData(element);
			super.setNext(new RecursiveDoubleLinkedListImpl<>());
			((RecursiveDoubleLinkedListImpl<T>) super.getNext()).setPrevious(this);
			if (this.previous == null)  {
				this.previous = new RecursiveDoubleLinkedListImpl<>();
			} 
		} else {
			T aux = super.getData();
			super.setData(element);
			((RecursiveDoubleLinkedListImpl<T>) super.getNext()).setPrevious(this);
			((RecursiveDoubleLinkedListImpl<T>) super.getNext()).insertFirst(aux);
		}
	}
	
	@Override
	public void remove(T element) {
		if (!super.isEmpty()) {
			if ((this.previous.isEmpty()) && (super.getNext().isEmpty())) {
				super.setData(super.getNext().getData());
				this.previous = null;
			} else {
				super.setData(super.getNext().getData());
				super.setNext(super.getNext().getNext());
				if (super.getNext() != null) {
					((RecursiveDoubleLinkedListImpl<T>) super.getNext()).setPrevious(this);
				}
			}
		} else {
			((RecursiveDoubleLinkedListImpl<T>) super.getNext()).remove(element);
		}
	}

	@Override
	public void removeFirst() {
		if (!super.isEmpty()) {
			if ((this.previous.isEmpty()) && (super.getNext().isEmpty())) {
				super.setData(null);
				super.setNext(null);
				this.previous = null;
			} else {
				super.setData(super.getNext().getData());
				super.setNext(super.getNext().getNext());
				if (super.getNext() != null) {
					((RecursiveDoubleLinkedListImpl<T>) super.getNext()).setPrevious(this);
				}
			}
		}
	}

	@Override
	public void removeLast() {
		if (!this.isEmpty()) {
			if (super.getNext().isEmpty()) {
				super.setData(null);
			} else {
				((RecursiveDoubleLinkedListImpl<T>) super.getNext()).removeLast();
			}
		}
	}
	
	public RecursiveDoubleLinkedListImpl<T> getPrevious() {
		return previous;
	}

	public void setPrevious(RecursiveDoubleLinkedListImpl<T> previous) {
		this.previous = previous;
	}

}
