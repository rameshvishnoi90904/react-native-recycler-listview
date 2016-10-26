
import { PropTypes } from 'react';
import { requireNativeComponent, View } from 'react-native';

var iface = {
  name: 'ImageView',
  propTypes: {
    src: PropTypes.object,
    customStyle: PropTypes.object,
    ...View.propTypes // include the default view properties
  },
};

module.exports = requireNativeComponent('RCTListView', iface);
