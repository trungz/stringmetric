package org.hashtree.stringmetric.cli

/** Provides core similarity CLI functionality. */
package object similarity {
	implicit val optionMap: OptionMap = OptionMapUtility.toOptionMap(Array("--unitTest=false"))
}