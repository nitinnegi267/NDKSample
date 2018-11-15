//
// Created by nitin.negi on 30-10-2018.
//

#include "PrimeNumber.h"

PrimeNumber::PrimeNumber(int x) {
    PrimeNumber::number = x;
}

bool PrimeNumber::isPrime() {

    bool isPrime = true;

    for (int i = 2; i <= number / 2; i++) {

        if (number % i == 0) {
            return false;
        } else {
            isPrime = true;
        }
    }
    return isPrime;

}
