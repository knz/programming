LENGTE_ALPHABET = 26
CODE_A = 97
CODE_Z = 122

# print een alphabet op 1 regel

n = 0
while n < LENGTE_ALPHABET:
    print "%c" % (CODE_A + n),
    n = n + 1

print

# andere versie / manier voor hetzelfde
n = CODE_A
while n <= CODE_Z:
    print "%c" % n,
    n = n + 1

print
