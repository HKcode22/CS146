def fib(n):
    a=0
    b=1
    c=0
    for i in range(2,n+1):
        c=a+b
        a=b
        b=c
    return c

if __name__ == "__main__":
    n= 8
    print("computing Fib: ",fib(n))
