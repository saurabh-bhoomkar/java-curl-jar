/*
** $Id$
*/

package net.haxx.curl;

public interface CurlRead
{
  /**
   * retrieveString gets called by libcurl to obtain chunks of data
   * to send to the remote server.
   */
  int retrieveString(byte s[]);
}
