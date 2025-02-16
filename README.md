# message-encryption-and-decryption

Title: Term Project 

Objective: Develop a message encryption and decryption program with secret key implementing Columnar Transposition and Double Transposition Cipher algorithms as described in this assignment in part I exercise.  You will also need to develop the program to crack the encrypted message without secret key using Brute-force and Known-plaintext attack methods.

You should demonstrate the skill on the OOP principles on encapsulation, inheritance, and polymorphism. 

Activity:

0. Accept and Complete github assignment link,

GitHub Assignment

Links to an external site.

Part I:

    Create 3 versions of text file contains the plain text message at least 500 chars long
    Your program should be able to load the plaint text file into memory; you should allow user to select which message text file to load and print on the console subsequently.
    Your program should be able to generate random secret key range from 0-9 with key length (5-6) as directed by user input from the system console. 
    Optional: Instead of using Alphabets range from a-z with key length (5-6) as keyword; use generated random secret key in numbers. You may implement Alphabets as keyword as bonus question for Part II. 
    Your program should be able to encrypt the message with secret key from #4 using Columnar Transposition Cipher.   
    columnar-transposition-cipher1.png
    Your program should be able to decrypt the message with secret key from #4.
    To decipher it, the recipient has to work out the column lengths by dividing the message length by the key length. Then, write the message out in columns again, then re-order the columns by reforming the key word.
    Implement Double transposition Cipher and repeat the steps

Part II:

You will need to develop the program to crack the encrypted message assuming you have lost secret key.

    Your program shall be able to use Brute-force attack method (https://capec.mitre.org/data/definitions/20.html 

    Links to an external site.) on trying all possible secret keys based on known secret key generation principle in Part I.#4.  
    Your program shall attempt to decrypt the encrypted message with guessing secret key and assert if decrypted message matches the original plain text message.
    Your program shall list the number of attempts before correct secret key found.
    Implement Known-plaintext attack method and repeat the steps.

Reference:

https://en.wikipedia.org/wiki/Transposition_cipher

https://youtu.be/sHsnH1u03e4
