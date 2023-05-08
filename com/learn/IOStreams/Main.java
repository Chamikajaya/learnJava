package com.learn.IOStreams;
/*  Buffer -> Balls throwing an catching example :)
Buffer -> buffer is a temporary storage area in memory that is used for holding data until it is ready to be processed or transferred to another location.
A buffer is essentially an array of bytes or characters that allows data to be read or written more efficiently, in larger chunks, rather than one byte or character at a time.
We need buffers in Java because they provide a way to improve the performance of I/O operations by reducing the number of times that data needs to be transferred between the program and the underlying system.
Without buffers, each byte or character would need to be read or written individually, which can be a slow process.
 Also a large piece of  ("John" -> J, o, h, n / 12567-> 1, 2, 5, 6, 7) is sent as either a stream of characters or as a stream of bytes.
 Byte streams are used for binary data(audio, video, ...), while character streams are used for text data.
 Classes for byte streams --> InputStream & OutputStream
 Classes for character streams --> Reader & Writer
 */

