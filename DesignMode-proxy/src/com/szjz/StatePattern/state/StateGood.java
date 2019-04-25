package com.szjz.StatePattern.state;

import com.szjz.StatePattern.Sportsman;

/**
 * ״̬�ܰ�
 * @author ʯ�о���
 *
 */
public class StateGood implements State {

	@Override
	public void state(Sportsman sportsman) {

		sportsman.setState(this);
	}

}
