import sys

def get_gen(inp):
    for line in inp:
        for tok in iter(line.split()):
            yield tok


def solve(gen, out):
    try:
        a = int(next(gen))
    except:
        return False
    b = int(next(gen))
    out.write("%d\n" % (a + b))
    out.flush()
    return True


inp = open("a.in", "r")
# inp = sys.stdin
gen = get_gen(inp)

# out = open("a.out", "w")
out = sys.stdout

while (solve(gen, out)):
    pass

inp.close()
out.close()

