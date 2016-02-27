package base;

public class MyInteger {
int iValue;
int getiValue(){ return iValue; }
int MyInteger = iValue;


private static boolean isPrime(int iValue) {
	if (iValue % 2 ==0) return false;
	for (int i = 3; i* i < iValue ; i += 2)
		if (iValue % i == 0) return false;
	return true;
}


private static boolean isEven(int iValue) {
	if (iValue % 2 ==0) return true;
	else return false;
}	

private static boolean isOdd(int iValue) {
	if (iValue % 2 ==0) return false;
	else return true;
	
}

private static boolean isPrime1(int MyInteger) {
	if (MyInteger % 2 ==0) return false;
	for (int i = 3; i* i < MyInteger ; i += 2)
		if (MyInteger % i == 0) return false;
	return true;
}


private static boolean isEven1(int MyInteger) {
	if (MyInteger % 2 ==0) return true;
	else return false;
}	

private static boolean isOdd1(int MyInteger) {
	if (MyInteger % 2 ==0) return false;
	else return true;
	
}
}
