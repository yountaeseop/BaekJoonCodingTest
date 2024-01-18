package stack;

import java.util.EmptyStackException;

public class Stack <E> {
	private E[] s;
	private int top;
	//private int size; - size는 필요없다 왜 필요없는거지?
	
	public Stack() {
		this.s = (E[])new Object[1];
		//this.s = (E[])new Object[2];
		// 초기에 크기가 2가 아니라 1인 배열로 생성해야한다. 왜지?
		// 근데 딱히 상관은 없을지도?
		this.top = -1;
		//this.size = 0;
	}
	public boolean isEmpty() {
		return top == -1;
		// return size == 0;
		// stack에서는 원소가 아무것도 없을때
		// top의 인덱스가 -1이기때문에 
		// size없이 top을 -1로만 설정하면 된다.
	}
	
	public E peek() {
		if(isEmpty()) {
			throw new EmptyStackException();
			// underflow시 프로그램 정지
		}
		return s[top];
	}
	
	public int size() {
		return top + 1;
		// size를 멤버변수로 두는게 아니라
		// top을 이용해서 size를 알아낸다. - 철저하게 top중심이구만
	}
	
	public void push(E newValue) {
		if(size() == s.length) { // 원소개수와 배열길이가 같을때!!!
			resize(s.length * 2);
		}
		s[++top] = newValue;
		//size++; 사이즈 계산할필요가 없음.
	}
	
	public E pop() {
		if(isEmpty()) {
			System.out.println("스택에 아무것도 없어요!");
			throw new EmptyStackException();
			//underflow시 프로그램 정지
		}
		if(top == s.length/4 && size() > 0) {
			resize(s.length/2);
		}
		E value = s[top];
		s[top--] = null; 	
		// --를 뒤에 붙이면 연산과정이
		// s[top] = null, top--
		// 이렇게 top을 null로 한다음에 top을 줄인다.
		
		
		//size--; 필요없음
		return value;
	}
	
	public void resize (int newSize) {
		E[] t = (E[]) new Object[newSize];
		
		for(int a = 0; a < size(); a++) {
			t[a] = s[a];
		}
		
		s = (E[])t;
	}
	
	public void print() {
		if(isEmpty()) {
			System.out.println("스택에 아무것도 없어요!");
		} else {
			for(int a = 0; a < s.length; a++) {
				System.out.print(s[a] + " ");
			}
		}
		System.out.println(); // 줄바꿈 넣어주자!
	}
}
