import itertools

chars = 'abcdefghijklmnopqrstuvwxyz'
n = 4
for xs in itertools.product(chars, repeat=n):
    print(''.join(xs))