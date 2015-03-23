// Tags: JDK1.0

// Copyright (C) 1998 Cygnus Solutions

// This file is part of Mauve.

// Mauve is free software; you can redistribute it and/or modify
// it under the terms of the GNU General Public License as published by
// the Free Software Foundation; either version 2, or (at your option)
// any later version.

// Mauve is distributed in the hope that it will be useful,
// but WITHOUT ANY WARRANTY; without even the implied warranty of
// MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
// GNU General Public License for more details.

// You should have received a copy of the GNU General Public License
// along with Mauve; see the file COPYING.  If not, write to
// the Free Software Foundation, 59 Temple Place - Suite 330,
// Boston, MA 02111-1307, USA.  */

package gnu.testlet.java.lang.Character;
import gnu.testlet.Testlet;
import gnu.testlet.TestHarness;

public class to implements Testlet
{
  public int getExpectedPass() { return 7; }
  public int getExpectedFail() { return 5; }
  public int getExpectedKnownFail() { return 0; }
  public void test (TestHarness harness)
    {
      // The default case converter in CLDC only supports the ISO Latin-1
      // range of characters.

      harness.check (Character.toUpperCase ('a'), 'A');
      harness.check (Character.toUpperCase ('A'), 'A');
      harness.todo (Character.toUpperCase ('\uff5a'), '\uff3a');
      harness.check (Character.toUpperCase ('7'), '7');
      harness.todo (Character.toUpperCase ('\u01f2'), '\u01f1');

      harness.check (Character.toLowerCase ('q'), 'q');
      harness.check (Character.toLowerCase ('Q'), 'q');
      harness.check (Character.toLowerCase ('\u2638'), '\u2638');
      harness.todo (Character.toLowerCase ('\u01cb'), '\u01cc');
      harness.todo (Character.toLowerCase ('\u01ca'), '\u01cc');
      harness.check (Character.toLowerCase ('\u00df'), '\u00df');
      harness.todo (Character.toLowerCase ('\u2160'), '\u2170');
    }
}
