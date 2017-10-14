
# What did the others, techniques and methodologies used, evaluation methods, results

NTRU is a lattice-based public key cryptosystem, making it resistant to all known quantum
computer attacks. The first version of the system was developed in 1996 by mathematicians Jeffrey
Hoffstein (de), Jill Pipher, and Joseph H. SilvermanFirst. NTRU offers encryption,
decryption, and signing. It has been adopted as an IEEE 1363.1 and ANSI X9 Standard. NTRU delivers 
substantial performance and size advantages, making it ideal for mobile and embedded applications.

pqNTRUsign is the signature algorithm that accompanies NTRU. It uses the same proven mathematics
as NTRU.

NTRU and pqNTRUsign are available in 128-, 192-, and 256- quantum bit strengths

### SMALLEST CODE FOOTPRINT & SYSTEM RESOURCE UTILIZATION
* Tiny compiled code
* Consumes minimal CPU and battery resources
* Ideal for all environments, but particularly well suited for embedded and mobile devices
where code size is a major limitation
* Significantly reduces server utilization for large-scale deployments
### HUGE PERFORMANCE INCREASES
 * Highest performing public key cryptography
* Decryption is more than 92x faster than RSA decryption at an equivalent security level. NTRU
is nearly 60% faster than RSA at encryption and TLS with a 370 times improvement in
key generation time.
 * Encryption and decryption are faster than the best-performing ECC algorithms at equivalent
security levels.

Originally, NTRU was only available as a proprietary, for-pay library and open source authors 
were threatened with legal action. It was not until 2011 that the first open-source implementation appeared,
and in 2013, Security Innovation exempted open source projects from having to get a patent license, and released
an NTRU reference implementation under the GPL v2.

### Three open-source NTRU implementations now exist:

* The GPL-licensed reference implementation
* A BSD-licensed library
* bouncycastle 

# Important names in the field, research teams

* Jeffrey Hoffstein, Jill Pipher, Joseph H. Silverman (developed the first version of NTRU)
* Daniel Lieman (founded the NTRU Cryptosystems, Inc.)
* Ron Steinfeld, Daniel Bernstein (created a provably secure version of NTRU)
* Chitchanok Chuengsatiansup, Tanja Lange, Christine van Vredendaal (released NTRU Prime,
which adds defenses against potential attack to NTRU by eliminating worrisome algebraic structure)

# Related articles and books

* **An Introduction to Mathematical Cryptography** by Jeffrey Hoffstein, Jill Pipher, Joseph H. Silverman
* **NTRU Cryptography: A Lattice-Based Cryptosystem** and Attacks against it by Kevin Brand
* [Lectures on the NTRU encryption algorithm and digital signature](http://www.math.brown.edu/~jpipher/grenoble.pdf)
* [NTRU software implementation for constrained devices](https://www.esat.kuleuven.be/cosic/publications/thesis-161.pdf)

# Relevant links

*[NTRU](https://en.wikipedia.org/wiki/NTRU)
*[Public-key cryptography](https://en.wikipedia.org/wiki/Public-key_cryptography)



# Resources and tools

