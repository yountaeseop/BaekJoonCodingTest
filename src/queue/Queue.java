package queue;

import java.util.NoSuchElementException;

public class Queue <E> {
	private E[] q;
	private int front, rear, size;
	
	public Queue() {
		this.q = (E[])new Object[2];
		//this.q = (E[])new Object[1]; X
		// 초기에 크기가 2인 배열 생성
		this.front = rear = size = 0;
	}
	
	public boolean isEmpty() {
		return size == 0;
	}
	
	public int size() {
		return size;
	}
	
	public void add(E newValue) {
		if(rear+1%q.length == front) {
			// 원형리스트에서 계속 삽입하다가 결국 1칸을 비워둬야하는
			// front랑 만난다는 그림을 떠올려보자
			resize(q.length * 2);
		}
		rear = (rear+1)%q.length;
		q[rear] = newValue;
		size++;
	}
	
	public E remove() {
		if(isEmpty()) {
			throw new NoSuchElementException();
		} else if(q.length / 4 == size) {
			resize(q.length / 2);
		}
		
		front = (front+1)%q.length;
		
		E item = q[front];
		
		q[front] = null;
		size--;
		
		return item;
	}
	
	private void resize(int newSize) {
		Object[] t = new Object[newSize]; // newSize 크기의 새로운 배열 t생성
		for(int a = 1, i = front+1; a < size + 1; a++, i++) {
			//front한칸 비우는거니까 a가 1부터 시작하는 것이다.
			// **헷갈리지말자! 배열에서 front자리는 0번인덱스이다!!
			t[a] = q[i%q.length]; // 배열 q의 항목들을 배열 t[1]로부터 복사
		}
		
		front = 0;
		rear = size;
		q = (E[])t; // 배열 t를 배열 q로
		
	}

	
}
