def anagram(s, t):
    if len(s) != len(t):
        return False

    charcounts = {}
    charcountt = {}

    for c in s:
        charcounts[c] = charcounts.get(c, 0) + 1

    for c in t:
        charcountt[c] = charcountt.get(c, 0) + 1

    return charcounts == charcountt

def main():
    print(anagram("anagram", "nagaram"))
    print(anagram("meow", "bark"))

if __name__ == "__main__":
    main()
