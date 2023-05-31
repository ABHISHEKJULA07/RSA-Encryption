package rsa.lib;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Primes {
    private List<Integer> primes;
    private Random random;
    private static final int MAX_PRIME = 99, MIN_PRIME = MAX_PRIME / 10;

    public Primes() {
        random = new Random(System.currentTimeMillis());
        primes = new ArrayList<>();
        boolean[] isPrime = new boolean[MAX_PRIME + 1];
        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false;
        for (int i = 2; i <= MAX_PRIME; i++) {
            if (!isPrime[i]) {
                continue;
            }
            
            primes.add(i);
            for (int j = i * i; j <= MAX_PRIME; j += i) {
                isPrime[j] = false;
            }
        }
        while (primes.get(0) <= MIN_PRIME) {
            primes.remove(0);
        }
    }

    public int getRandom() {
        return primes.remove(random.nextInt(primes.size()));
    }
}