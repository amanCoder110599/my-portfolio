
package com.google.sps.data;

/** An item on a comments list. */
public final class Comment {

  private final long id;
  private final String comment;
  private final String email;
  private final long timestamp;

  public Comment(long id, String comment, String email, long timestamp) {
    this.id = id;
    this.comment = comment;
    this.email = email;
    this.timestamp = timestamp;
  }
}
