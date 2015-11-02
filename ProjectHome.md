The ultimate goal of this project is to either be subsumed into the official Java project at http://curl.haxx.se/libcurl/java/ or for the Java classes there to be permanently moved here.

This project is essentially a response to the blog at:

http://chimpler.blogspot.com/2009/03/logging-to-ebay-with-java-curl.html

which points out some bugs with the libcurl-java classes (some of which have been fixed).

Oddly, I was unable to locate the CurlGlue source and had to decompile it from a JAR; it seems that the this class is built with the MakeCurlGlue class, although I don't understand the rationale for writing the source code of one class in another class.  I was unable to directly locate the resulting code for CurlGlue.

There may also be a python script involved in creating the Java source for CurlGlue.java.  I can only speculate, and hope, that the constants declared in this class don't vary from platform to platform, however I can't be certain.  A utility class may be useful for interfacing with cURL to dynamically populate a collection of constants correctly.