package com.openrsc.server.net.rsc.struct;

import com.openrsc.server.net.rsc.enums.OpcodeIn;

public class PrivacySettingsStruct extends AbstractStruct<OpcodeIn> {

	public int hideStatus;
	public int blockChat;
	public int blockPrivate;
	public int blockTrade;
	public int blockDuel;
}