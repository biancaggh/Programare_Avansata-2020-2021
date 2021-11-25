package bonus_2;

import java.math.BigInteger;
import java.util.Random;

public class Vogel {
//   private BigInteger d11,d12,d13,d21,d22,d23,d31,d32,d33,D1,D2,D3,S1,S2,S3;
    private BigInteger generateNumber(int bitLength, Random rand) //genereaza numere prime impare
    {
        BigInteger number = BigInteger.probablePrime(bitLength, rand);
        return number;
    }
    
}
